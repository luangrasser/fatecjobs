import 'package:fatecjobs_frontend/widgets/login.dart';
import 'package:flutter/material.dart';

class EsqueceuSuaSenha extends StatefulWidget {
  @override
  _EsqueceuSuaSenhaState createState() => _EsqueceuSuaSenhaState();
}
class _EsqueceuSuaSenhaState extends State<EsqueceuSuaSenha> {
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
                decoration: InputDecoration(
                  labelText:"Identifique-se com o e-mail cadatro, para que possa ser passado as instruções",
                  labelStyle: TextStyle(color: Colors.black),
                )
           ),
              Divider(),
              TextField(
                autofocus: true,
                obscureText: true,
                keyboardType: TextInputType.emailAddress,
                style: TextStyle(color: Colors.black, fontSize: 30),
                decoration: InputDecoration(
                  labelText:"Digite o email",
                  labelStyle: TextStyle(color: Colors.black),
                )
              ),
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    Navigator.pop(
                      context,
                      MaterialPageRoute(builder:(context)=>Login())
                    )
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Enviar",
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
