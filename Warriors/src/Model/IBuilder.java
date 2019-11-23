/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author naty9
 * Interface del Builder
 */
public interface IBuilder<T>  {
    public T build();
    public T build(T t);
}
