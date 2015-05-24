#TP Client/Serveur 

EJBModule dans la partie Serveur contient un 2 webservice : executeCommand et creerfichier()
La méthode executecommand permet d’executer des commandes Linux/Unix en java , j’ai injecté la commande ping -c 3 qui fait 3 tentatives de la commandes Ping sur l’adresse IP destinataire (en Windows : ping -n 3) 
La méthode creerfichier() permet de creer un fichier et de l’éditer . le paramètre d’entrée doit être de type String et joue le rôle du contenu . 

WebClient2 dans la partie client fait appel aux méthodes existante dans la partie serveur et les affiches via 2 pages JSP index.jsp => action.jsp 
la premiere vue permet de recolter l’IP du client et la 2ème fait actionner la commande Ping et créer le fichier .
