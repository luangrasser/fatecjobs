import 'package:fatecjobs_frontend/widgets/formularioaluno.dart';
import 'package:fatecjobs_frontend/widgets/formularioempresa.dart';
import 'package:fatecjobs_frontend/widgets/formularioprofessor.dart';
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
               TextField(
                autofocus: true,
                keyboardType: TextInputType.text,
                style: TextStyle(color: Colors.blue, fontSize: 30),
           ),
              
              Divider(),
              ButtonTheme(
                height: 60.0,
                child: RaisedButton(
                  onPressed: () => {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder:(context)=>FormularioAluno())
                    )
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
                  onPressed: () => {Navigator.push(
                      context,
                      MaterialPageRoute(builder:(context)=>FormularioProfessor())
                    )
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Professor",
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
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder:(context)=>FormularioEmpresa())
                    )
                  },
                  shape:  new RoundedRectangleBorder(borderRadius: 
                          new BorderRadius.circular(30.0)),
                  child: Text(
                    "Empresa",
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