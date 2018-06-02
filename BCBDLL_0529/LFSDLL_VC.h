// The following ifdef block is the standard way of creating macros which make exporting 
// from a DLL simpler. All files within this DLL are compiled with the LFSDLL_VC_EXPORTS
// symbol defined on the command line. this symbol should not be defined on any project
// that uses this DLL. This way any other project whose source files include this file see 
// LFSDLL_VC_API functions as being imported from a DLL, whereas this DLL sees symbols
// defined with this macro as being exported.
#ifdef LFSDLL_VC_EXPORTS
#define LFSDLL_VC_API __declspec(dllexport)
#else
#define LFSDLL_VC_API __declspec(dllimport)
#endif

#include "DataDef.h" 
// This class is exported from the LFSDLL_VC.dll
class LFSDLL_VC_API CLFSDLL_VC {
public:
	CLFSDLL_VC(void);
	// TODO: add your methods here.
};

extern LFSDLL_VC_API int nLFSDLL_VC;

LFSDLL_VC_API int fnLFSDLL_VC(void);

LFSDLL_VC_API int InitCom( char *IPAddrStr, WORD RemotePort, PIC_TO_PC_TYPE* ReceiveBuffer, int BufferSize, PC_TO_PIC_TYPE* SendBuffer  );
LFSDLL_VC_API bool SetIPAddr( char *IPAddrStr );
LFSDLL_VC_API void SetIO( BYTE IONo, BYTE Status );
LFSDLL_VC_API void AskStatus( void );
LFSDLL_VC_API void AskIODir( void );
LFSDLL_VC_API void SetIODir( IODIR_TYPE *IODirPtr );
LFSDLL_VC_API void AskNETConfig( void );
LFSDLL_VC_API void SetNETConfig( PIC2PC_APPCONFIG * ConfigPtr );
LFSDLL_VC_API void SetDefaultNETConfig( void );
