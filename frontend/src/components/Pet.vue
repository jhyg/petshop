<template>

<v-card style="width:300px; margin-left:5%;" outlined>
    <template slot="progress">
      <v-progress-linear
        color="deep-purple"
        height="10"
        indeterminate
      ></v-progress-linear>
    </template>

    <v-img
      style="width:290px; height:150px; border-radius:10px; position:relative; margin-left:5px; top:5px;"
      src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
    ></v-img>

    <v-card-title v-if="value._links">
        Pet # {{value._links.self.href.split("/")[value._links.self.href.split("/").length - 1]}}
    </v-card-title >
    <v-card-title v-else>
        Pet
    </v-card-title >

    <v-card-text style = "margin-left:-15px; margin-top:10px;">

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="Name" v-model="value.name"/>
          </div>
          <div class="grey--text ml-4" v-else>
            Name :  {{value.name }}
          </div>




          <div>
            <Address label:=Address v-model="value.address" :editMode="editMode"/>
          </div>


    </v-card-text>

    <v-divider class="mx-4"></v-divider>

    <v-card-actions style = "position:absolute; right:0; bottom:0;">
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="edit"
        v-if="!editMode"
      >
        Edit
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="save"
        v-else
      >
        Save
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="remove"
        v-if="!editMode"
      >
        Delete
      </v-btn>
      
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="feed"
        v-if="!editMode"
      >
        Feed
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="unregister"
        v-if="!editMode"
      >
        Unregister
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="test"
        v-if="!editMode"
      >
        Test
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="test2zzzz"
        v-if="!editMode"
      >
        Test2zzzz
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="test333"
        v-if="!editMode"
      >
        Test333
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="test444"
        v-if="!editMode"
      >
        Test444
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="test555"
        v-if="!editMode"
      >
        Test555
      </v-btn>
    </v-card-actions>
  </v-card>


</template>

<script>
  const axios = require('axios').default;
  
  
  
  
  import Address from './vo/Address.vue'
  
  export default {
    name: 'Pet',
    components:{
      Address,
    },
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),
    created(){
      if(typeof this.value.address === 'undefined'){
        this.value.address = {}
      }
    },

    methods: {
      edit(){
        this.editMode = true;
      },
      async save(){
        try{
          var temp = null;
          if(this.isNew){
            temp = await axios.post(axios.fixUrl('/pets'), this.value)
          }else{
            temp = await axios.put(axios.fixUrl(this.value._links.self.href), this.value)
          }

          this.value = temp.data;

          this.editMode = false;
          this.$emit('input', this.value);

          if(this.isNew){
            this.$emit('add', this.value);
          }else{
            this.$emit('edit', this.value);
          }

        }catch(e){
          alert(e.message)
        }
      },
      async remove(){
        try{
          await axios.delete(axios.fixUrl(this.value._links.self.href))
          this.editMode = false;
          this.isDeleted = true;

          this.$emit('input', this.value);
          this.$emit('delete', this.value);

        }catch(e){
          alert(e.message)
        }
      },
      async feed(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['feed'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async unregister(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['unregister'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async test(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['test'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async test2zzzz(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['test2zzzz'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async test333(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['test333'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async test444(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['test444'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
      async test555(){
        try{
          var temp = await axios.put(axios.fixUrl(this.value._links['test555'].href))
          this.value = temp.data;
          this.editMode = false;
        }catch(e){
          alert(e.message)
        }
      },
      
    },
  }
</script>

