
solution {
    puzzle = "P020"
    name = "B CA 6T"
    arm(PISTON) {
        number = 1
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -6 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -7 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    track {
        position = -7 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                back()
                extend()
                extend()
                back()
                drop()
                retract()
                back()
                retract()
                back()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                back()
                extend()
                extend()
                retract()
                extend()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                wait(2)
                grab()
                back()
                extend()
                extend()
                back()
                drop()
                retract()
                back()
                retract()
                repeat()
                wait(11)
                repeat()
                wait(11)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                back()
                retract()
                back()
                wait(2)
                grab()
                back()
                extend()
                extend()
                back()
                drop()
                retract()
                repeat()
                wait(11)
                repeat()
                wait(11)
                back()
                wait(1)
                grab()
                forward()
                forward()
                wait(2)
                extend()
                wait(3)
                retract()
                reset()
            }
        }
        )
    }
}
