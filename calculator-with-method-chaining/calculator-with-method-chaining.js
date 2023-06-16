class Calculator {
  
  /** 
   * @param {number} value
   */
  constructor(value) {
      this.number = value;
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  add(value){
      this.number += value;
      console.log('add', value, this.number)
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  subtract(value){
      this.number -= value;
      console.log('subtract', value, this.number)
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */  
  multiply(value) {
      this.number *= value;
      console.log('multiple', value, this.number)
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  divide(value) {
      if(value !== 0){
          this.number /= value;
      }else{
        throw new Error("Division by zero is not allowed")
}
    console.log('divide', value, this.number)
  }
  
  /** 
   * @param {number} value
   * @return {Calculator}
   */
  power(value) {
      let keep = this.number;
      if(value === 0){
          this.number = 1;
      }else if(value < 0){
          for(let i = value; i <= 0; i++){
              this.number /= keep;
          }
      }else{
        for(let i = 1; i < value; i++){
            this.number *= keep;
        }
      }
      if(this.number == Infinity){
          this.number = -2;
      }
      if(isNaN(this.number)){
          this.number = 0;
      }
      console.log('power', value, this.number)
  }
    
  /** 
   * @return {number}
   */
  getResult() {
      return this.number;
  }
}