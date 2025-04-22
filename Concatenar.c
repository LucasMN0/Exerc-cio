void concatenar_pilhas(Pilha* p1,Pilha* p2){
	Pilha* p3 = (Pilha*)malloc(sizeof(Pilha));
	iniciar_pilha(p3);
	int topo;
	while(p2->inicio!=NULL){
		topo=top(p2);
		desempilhar(p2);
		empilhar(p3,topo);
	}
	while(p3->inicio!=NULL){
		topo=top(p3);
		desempilhar(p3);
		empilhar(p1,topo);
	}
	free(p3);
}
