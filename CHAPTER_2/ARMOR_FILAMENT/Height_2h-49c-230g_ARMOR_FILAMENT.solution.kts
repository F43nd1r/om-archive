
solution {
    puzzle = "P020"
    name = "H2 C 6T"
    arm(ARM1) {
        number = 1
        position = -10 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -9 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -8 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -10 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -6 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -8 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -5 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 0
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -10 to 1
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to -1, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(2)
                grab()
                back()
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
                back()
                drop()
                grab()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                forward()
                forward()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                wait(3)
                forward()
                wait(1)
                repeat()
                wait(15)
                grab()
                forward()
                forward()
                forward()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                wait(3)
                repeat()
                wait(15)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                back()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                forward()
                wait(2)
                forward()
                wait(2)
                forward()
                wait(2)
                grab()
                forward()
                forward()
                forward()
                back()
                drop()
                repeat()
                wait(15)
                forward()
                forward()
                wait(2)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                wait(3)
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                extend()
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
                extend()
                drop()
                grab()
                retract()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                forward()
                wait(3)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                back()
                drop()
                forward()
                forward()
                wait(2)
                repeat()
                wait(15)
                forward()
                wait(2)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(5) {
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
        )
    }
}
