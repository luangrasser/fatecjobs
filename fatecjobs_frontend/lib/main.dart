import 'package:flutter/material.dart';
import 'package:fatecjobs_frontend/widgets/login.dart';
import 'package:fatecjobs_frontend/widgets/selecionarCadastro.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
  return MaterialApp(
    title:'Fatec Jobs',
    theme:ThemeData(primarySwatch: Colors.red),
    home:Login(),
  );
  }
}
