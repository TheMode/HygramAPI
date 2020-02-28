# Presentation
Hygram stands for Hybrid program, its goal is to divide computation power between clients & server which can be 
graphical with the GPU or CPU for generic applications while keeping only one code base.

# How does it work
Hygram works by being connected to a server during the whole use, a server which can be hosted by yourself.

After developing your window application, you have three ways of launching it:
* Local mode
* Remote mode
* Stream mode

The local mode is pretty straightforward, you are basically opening the app and doing all the work locally, except that there's
still some ways to split some of its weight to the server by doing server request (CPU) or by asking a stream for a part of the window (GPU)

The second and third launch type mean that the server is entirely in charge of the CPU workload and a part of the GPU one, the server does only receive input event from the clients. The graphical part can be divided in two, the remote mode is a graphical command redirection so the client still has to render everything asking for a high performance GPU but also a modest bandwidth, in contrary, the stream mode means that the client only has to manage a video stream asking this time for a high bandwidth but allow poor hardware.

# Goal
Hygram offers a way to use your application no matter on which device you are, while keeping good performance thanks to streaming and proper optimization
and having a sole code-base meaning easier development.
