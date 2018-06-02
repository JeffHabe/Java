#if !defined _DATADEF_
#define _DATADEF_

#pragma pack(1)

typedef union _WORD_VAL
{
    WORD Val;
    BYTE v[2];
} WORD_VAL;
//
typedef struct _MAC_ADDR
{
    BYTE v[6];
} MAC_ADDR;
//
typedef struct _IP_ADDR
{
    BYTE        v[4];
} IP_ADDR;
//
typedef struct _NODE_INFO
{
    MAC_ADDR    MACAddr;
    IP_ADDR     IPAddr;
} NODE_INFO;
//
typedef struct _APP_CONFIG
{
    IP_ADDR     MyIPAddr;
    MAC_ADDR    MyMACAddr;
    IP_ADDR     MyMask;
    IP_ADDR     MyGateway;
    WORD_VAL    SerialNumber;
    IP_ADDR     SMTPServerAddr;     // Not used.
    struct
        {
                unsigned int bIsDHCPEnabled : 1;
        } Flags;
}       PIC2PC_APPCONFIG;
//
//=============================================================================
//-------------------------------------------------------------------------
typedef   struct
{
                char    Id[8];
                WORD    SendCount;
                WORD    Length;
                BYTE    CheckSum;
                BYTE    Command;
                BYTE    Data[40];
                                                    //char    Data[100];  // 20
}       PC_TO_PIC_TYPE;
//-----------------------------------------------
// 20060217 mod
typedef   struct
{
                char    Id[8];
                WORD    SendCount;
		        WORD    Length;
                BYTE    CheckSum;
		        BYTE    Command;
                BYTE    Data[40];
                                                    //char    Data[100]; // 20
}       PIC_TO_PC_TYPE;
//-----------------------------------------------
typedef   struct
{
                WORD    AValue[8];
                BYTE    InValue;
                BYTE    OutValue;
}		PIC_STATUS_TYPE;
//-----------------------------------------------
typedef   struct
{
                BYTE    ConfigType;
                BYTE    Data[20];
}       PC2PIC_COMMANDBUFFERTYPE;
//-----------------------------------------------
typedef struct
{
                BYTE    BitNo;
                BYTE    Status;
}       PC_SETIO_TYPE;
//-----------------------------------------------
typedef struct
{
                BYTE    ConfigType;
                BYTE    DataBuffer[20];
}       PC_SETCONFIG_TYPE;
//-----------------------------------------------
typedef struct
{               BYTE    Val[12];
}       IODIR_TYPE;
//-----------------------------------------------
#define SET_IO_CMD              'W'
#define ASK_STATUS_CMD          'R'
#define ASK_CONFIG_CMD          'G'
#define SET_DEFAULTCONFIG_CMD 	'S'             // 20060322 MOD
#define SEND_CONFIG_CMD         'F'             // 20060310 add
#define ASK_IODIR_CMD           'O'
#define SET_IODIR_CMD           'P'
#define SET_DEFAULTIODIR_CMD   	'D'
#define RETURN_STATUS_CMD       'r'
#define RETURN_CONFIG_CMD       'g'
#define RETURN_SETUP_OK  	    's'
#define RETURN_IODIR_CMD        'o'
//----------------------------------------------
// Configuration setup Type
//----------------------------------------------
//#define		    CHANGE_CONFIG	6
//#define		    RESTORE_CONFIG	7
#define		    DEFAULT_CONFIG	8
//-------------------------------------------------------------------------
#define         ASK_WAIT_TIME   500


#endif