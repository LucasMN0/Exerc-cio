Lista* merge(Lista* L1, Lista* L2){
    No* temp1 = L1->inicio;
    No* temp2 = L2->inicio;

    Lista* L3 = (Lista*)malloc(sizeof(Lista));
    L3->inicio=NULL;
    No* temp3 = NULL;

    while(temp1!=NULL || temp2!=NULL){
        if(temp1!=NULL){
            No* novo_no = (No*)malloc(sizeof(No));
            novo_no->prox=NULL;
            novo_no->dado = temp1->dado;
            if(L3->inicio==NULL){
                L3->inicio=novo_no;
            }else{
                temp3->prox=novo_no;
            }

        temp3=novo_no;
        temp1=temp1->prox;
    
        }
        if(temp2!=NULL){
            No* novo_no = (No*)malloc(sizeof(No));
            novo_no->prox=NULL;
            novo_no->dado = temp2->dado;
            if(L3->inicio==NULL){
                L3->inicio=novo_no;
            }else{
                temp3->prox=novo_no;
                }
            temp3=novo_no;
            temp2=temp2->prox;
            }
        }
    free(L1);free(L2);
    return L3;

}
