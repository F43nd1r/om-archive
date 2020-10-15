
solution {
    puzzle = "P010"
    name = "H1 6T"
    arm(PISTON) {
        number = 1
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -9 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -11 to 0
        rotation = 0
        size = 3
    }
    glyph(PROJECTION) {
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to 0
        rotation = 0
    }
    track {
        position = -10 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                back()
                reset()
                wait(8)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                extend()
                wait(7)
                retract()
                drop()
                grab()
                extend()
                extend()
                wait(6)
                retract()
                drop()
                grab()
                extend()
                extend()
                wait(6)
                retract()
                drop()
                grab()
                extend()
                extend()
                wait(6)
                retract()
                drop()
                grab()
                extend()
                extend()
                wait(6)
                retract()
                drop()
                grab()
                extend()
                extend()
                wait(6)
                retract()
                reset()
            }
        }
        )
    }
}
