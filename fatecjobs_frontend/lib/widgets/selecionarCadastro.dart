import 'package:flutter/material.dart';

class SelecionarCadastro extends StatefulWidget {
  @override
  _SelecionarCadastroState createState() => _SelecionarCadastroState();
}
class _SelecionarCadastroState extends State<SelecionarCadastro> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.redAccent,
      body: Padding(
        padding: const EdgeInsets.all(10.0),
        child: Center(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    print("Cadastro aluno")
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Aluno/Ex-aluno",
                    style: TextStyle(color: Colors.white, fontSize: 30),
                  ),
                  color:Colors.black,
                ),
              ),
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    print("Cadastro professor")
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Professor",
                    style: TextStyle(color: Colors.white, fontSize: 30),
                  ),
                  color:Colors.black            
                ),
              ),
            Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    print("Cadastro empresa")
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Empresa",
                    style: TextStyle(color: Colors.white, fontSize: 30),
                  ),
                  color:Colors.black            
                ),
              ),
            ],
         ),
        ),
      )
   );
  }
}