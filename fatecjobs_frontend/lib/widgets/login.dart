import 'package:fatecjobs_frontend/widgets/selecionarCadastro.dart';
import 'package:flutter/material.dart';

class Login extends StatefulWidget {
  @override
  _LoginState createState() => _LoginState();
}
class _LoginState extends State<Login> {
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
               TextField(
                autofocus: true,
                keyboardType: TextInputType.emailAddress,
                style: TextStyle(color: Colors.blue, fontSize: 30),
                decoration: InputDecoration(
                  labelText:"E-mail do Usuário",
                  labelStyle: TextStyle(color: Colors.black),
                )
           ),
              Divider(),
              TextField(
                autofocus: true,
                obscureText: true,
                keyboardType: TextInputType.number,
                style: TextStyle(color: Colors.black, fontSize: 30),
                decoration: InputDecoration(
                  labelText:"Senha",
                  labelStyle: TextStyle(color: Colors.black),
                )
              ),
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder:(context)=>SelecionarCadastro())
                    )
                  },
                    child: Text(
                    "Não Possui Cadastro?Pressione",
                    style: TextStyle(color: Colors.white, fontSize: 30),
                  ),
                  color:Colors.black,   
                )
              ),
              //Divider(),
              //ButtonTheme(
                //height: 60.0,
                //child: RaisedButton(
                  //onPressed: () => {
                    //Navigator.push(
                      //context,
                      //MaterialPageRoute(builder:(context)=>Colocar())
                    //)
                  //},
                    //child: Text(
                    //"Esqueceu sua senha?Pressione",
                    //style: TextStyle(color: Colors.white, fontSize: 30),
                  //),
                  //color:Colors.black,   
                //)
              //), 
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    print("pressionei o botão"),
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Entrar",
                    style: TextStyle(color: Colors.white, fontSize: 30),
                  ),
                  color:Colors.black,
                ),
              ),
            ],
         ),
        ),
      )
   );
  }
}
