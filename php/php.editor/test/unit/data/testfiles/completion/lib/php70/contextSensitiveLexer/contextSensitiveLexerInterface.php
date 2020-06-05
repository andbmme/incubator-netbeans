<?php

interface InterfaceExample {

    const define = [1, 2];
    const callable = [1, 2];
    const trait = [1, 2];
    const extends = [1, 2];
    const implements = [1, 2];
    const static = [1, 2];
    const abstract = [1, 2];
    const final = [1, 2];
    const public = [1, 2];
    const protected = [1, 2];
    const private = [1, 2];
    const const = [1, 2];
    const enddeclare = [1, 2];
    const endfor = [1, 2];
    const endforeach = [1, 2];
    const endif = [1, 2];
    const endwhile = [1, 2];
    const and = [1, 2];
    const global = [1, 2];
    const goto = [1, 2];
    const instanceof = 100;
    const insteadof = 100;
    const interface = 100;
    const namespace = 100;
    const new = 100;
    const or = 100;
    const xor = 100;
    const try = 100;
    const use = 100;
    const var = 100;
    const exit = 100;
    const list = 100;
    const clone = 100;
    const include = 100;
    const include_once = 100;
    const throw = 100;
    const array = 100;
    const print = 100;
    const echo = 100;
    const require = 100;
    const require_once = 100;
    const return = 100;
    const else = 100;
    const elseif = 100;
    const default = 100;
    const break = 100;
    const continue = 100;
    const switch = 100;
    const yield = 100;
    const function = 100;
    const if = 100;
    const endswitch = 100;
    const finally = 100;
    const for = 100;
    const foreach = 100;
    const declare = 100;
    const case = 100;
    const do = 100;
    const while = 100;
    const as = 100;
    const catch = 100;
    const die = 100;
    const self = 100;
    const parent = 100;
    const __class__ = 100;
    const __trait__ = 100;
    const __function__ = 100;
    const __method__ = 100;
    const __line__ = 100;
    const __file__ = 100;
    const __dir__ = 100;
    const __namespace__ = 100;

    public function DEFINE();
    public function CLASS();
    public function CALLABLE();
    public function TRAIT();
    public function EXTENDS();
    public function IMPLEMENTS();
    public function STATIC();
    public function ABSTRACT();
    public function FINAL();
    public function PUBLIC();
    public function PROTECTED();
    public function PRIVATE();
    public function CONST();
    public function ENDDECLARE();
    public function ENDFOR();
    public function ENDFOREACH();
    public function ENDIF();
    public function ENDWHILE();
    public function AND();
    public function GLOBAL();
    public function GOTO();
    public function INSTANCEOF();
    public function INSTEADOF();
    public function INTERFACE();
    public function NAMESPACE();
    public function NEW();
    public function OR();
    public function XOR();
    public function TRY();
    public function USE();
    public function VAR();
    public function EXIT();
    public function LIST();
    public function CLONE();
    public function INCLUDE();
    public function INCLUDE_ONCE();
    public function THROW();
    public function ARRAY();
    public function PRINT();
    public function ECHO();
    public function REQUIRE();
    public function REQUIRE_ONCE();
    public function RETURN();
    public function ELSE();
    public function ELSEIF();
    public function DEFAULT();
    public function BREAK();
    public function CONTINUE();
    public function SWITCH();
    public function YIELD();
    public function FUNCTION();
    public function IF();
    public function ENDSWITCH();
    public function FINALLY();
    public function FOR();
    public function FOREACH();
    public function DECLARE();
    public function CASE();
    public function DO();
    public function WHILE();
    public function AS();
    public function CATCH();
    public function DIE();
    public function SELF();
    public function PARENT();
    public function __CLASS__();
    public function __TRAIT__();
    public function __FUNCTION__();
    public function __METHOD__();
    public function __LINE__();
    public function __FILE__();
    public function __DIR__();
    public function __NAMESPACE__();
}

class ClassExample implements InterfaceExample {
}

$class = new ClassExample();
$class->DEFINE();

InterfaceExample::class;
