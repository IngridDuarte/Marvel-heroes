
import { mount } from '@vue/test-utils'
import Category from '../../../../src/modules/Category/category';

describe('Category component', () => {
    let component;

  beforeEach(() => {
    component = mount(Category);
  });

  it('Should equals messages to `Hello World`', () => {
    expect(component.vm.message).toEqual('Hello World');
  });

  it('Should equals messages to `Hello Aceleradora 16`', () => {
    component.setData({ message: 'Hello Aceleradora 16'});
    
    
    expect(component.vm.message).toEqual('Hello Aceleradora 16');
  });
});