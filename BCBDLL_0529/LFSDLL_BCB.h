#include    "datadef.h"
int __declspec( dllexport ) WINAPI InitCom( char * IPAddr, WORD RemotePort, PIC_TO_PC_TYPE* ReceiveBuffer, int BufferSize, PC_TO_PIC_TYPE* SendBuffer );
bool __declspec( dllexport ) WINAPI SetIPAddr( char *IPAddrStr );
bool __declspec( dllexport ) WINAPI SendData( PC_TO_PIC_TYPE* SendBuffer );
bool __declspec( dllexport ) WINAPI SetIO( int IONo, char Status );
bool __declspec( dllexport ) WINAPI AskStatus( void );
bool __declspec( dllexport ) WINAPI AskIODir( void );
bool __declspec( dllexport ) WINAPI SetIODir( IODIR_TYPE *IODirPtr );
bool __declspec( dllexport ) WINAPI AskNETConfig( void );
bool __declspec( dllexport ) WINAPI SetNETConfig( PIC2PC_APPCONFIG * ConfigPtr );
bool __declspec( dllexport ) WINAPI SetDefaultNETConfig( void );
