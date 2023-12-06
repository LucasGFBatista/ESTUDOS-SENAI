import 'package:flutter/material.dart';
import '/segundaTela.dart';

void main() {
  runApp(const MaterialApp(
    home: (TelaPrincipal()),
  ));
}

class TelaPrincipal extends StatefulWidget {
  const TelaPrincipal({super.key});

  @override
  State<TelaPrincipal> createState() => _TelaPrincipalState();
}

class _TelaPrincipalState extends State<TelaPrincipal> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Tela Principal'),
      ),
      body: Container(
        child: Column(
          children: <Widget>[
            TextButton(
                onPressed: () {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => SegundaTela()));
                },
                child: Text('Vamos para segunda tela'))
          ],
        ),
      ),
    );
  }
}