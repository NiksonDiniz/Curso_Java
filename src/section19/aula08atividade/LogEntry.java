package section19.aula08atividade;


import java.util.Date;
import java.util.Objects;

public class LogEntry {
   private String user;
   private Date moment;

   public LogEntry(String user, Date moment) {
      this.user = user;
      this.moment = moment;
   }

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public Date getMoment() {
      return moment;
   }

   public void setMoment(Date moment) {
      this.moment = moment;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof LogEntry logEntry)) return false;
      return Objects.equals(getUser(), logEntry.getUser());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getUser());
   }
}
