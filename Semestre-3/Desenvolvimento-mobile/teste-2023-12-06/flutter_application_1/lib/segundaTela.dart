import 'package:flutter/material.dart';

class SegundaTela extends StatefulWidget {
  const SegundaTela({super.key});

  @override
  State<SegundaTela> createState() => _SegundaTelaState();
}

class _SegundaTelaState extends State<SegundaTela> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Segunda Tela'),
      ),
      body: Container(
        child: const Column(
          children: <Widget>[const Text('Meu o City vai me matar!!!')],
        ),
      ),
    );
  }
}