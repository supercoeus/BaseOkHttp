//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baseokio;

import java.io.IOException;

public abstract class ForwardingSink implements Sink {
  private final Sink delegate;
  
  public ForwardingSink(Sink delegate) {
    if (delegate == null) {
      throw new IllegalArgumentException("delegate == null");
    } else {
      this.delegate = delegate;
    }
  }
  
  public final Sink delegate() {
    return this.delegate;
  }
  
  public void write(Buffer source, long byteCount) throws IOException {
    this.delegate.write(source, byteCount);
  }
  
  public void flush() throws IOException {
    this.delegate.flush();
  }
  
  public Timeout timeout() {
    return this.delegate.timeout();
  }
  
  public void close() throws IOException {
    this.delegate.close();
  }
  
  public String toString() {
    return this.getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
  }
}
