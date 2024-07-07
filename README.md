# Float Action Buttom (FAB) - Circular

A ideia do projeto é demonstra como criar um Floating Action Button (FAB) circular utilizando MotionScene no Android. O MotionScene permite animações fluidas e interações complexas entre diferentes estados de layout em um MotionLayout.

![Screen_recording_20240706_213820](https://github.com/ant-lincoln/FAB-Circular/assets/19896054/2ea49eb1-e002-4cf1-ad0d-efcb385a6c4c)

### Estrutura do Projeto

Possui a seguinte estrutura básica:

|-- app
<br>    |-- src
<br>        |-- main
<br>            |-- java/com/example/motionscenefab
<br>                |-- MainActivity.kt
<br>                |-- RecyclerViewAdapter.kt
<br>            |-- res
<br>                |-- layout
<br>                    |-- activity_main.xml (MotionLayout)
<br>                    |-- item_list.xml
<br>                |-- xml
<br>                    |-- circularmenu_scene.xml
<br>                |-- drawable
<br>                    |-- shape_circle.xml
<br>                |-- values
<br>                    |-- colors.xml
<br>|-- README.md

•MainActivity.kt: Atividade principal que configura o MotionLayout e o RecyclerView.
<br>•RecyclerViewAdapter.kt: Adaptador para RecyclerView, popula dados (só para fins de exemplo).
<br>•activity_main.xml: Layout principal que contém o MotionLayout e o RecyclerView.
<br>•item_list.xml: Layout de item para RecyclerView.
<br>•circularmenu_scene.xml: Arquivo MotionScene que define a animação do FAB circular.
<br>•shape_circle.xml: Formato XML para desenhar um círculo.

O arquivo circularmenu_scene.xml define a transição e os estados do MotionLayout para animar o FAB circular. Ele usa um interpolador de movimento "overshoot" para criar uma animação suave de entrada e saída do FAB.


