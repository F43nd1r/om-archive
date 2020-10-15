
solution {
    puzzle = "P018"
    name = "W2 6T"
    arm(PISTON) {
        number = 1
        position = -6 to -6
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to -5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -4 to -4
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -3 to -3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 2 to 0
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to -6
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -4 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 2
        position = -5 to -7
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(1 to 1, 0 to 1, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(11)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                reset()
                wait(2)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                wait(4)
                extend()
                reset()
                wait(4)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(6)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(24)
                grab()
                retract()
                reset()
                wait(12)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        )
    }
}
