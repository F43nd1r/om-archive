
solution {
    puzzle = "P015"
    name = "B CA 3T"
    arm(ARM1) {
        number = 1
        position = 3 to -1
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 0 to 3
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 1 to 2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 2 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to 0
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 2
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(-1 to 1, -1 to 0, -1 to -1, 0 to -1, 0 to 0)
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                forward()
                extend()
                retract()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(1)
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                grab()
                forward()
                extend()
                retract()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                forward()
                wait(1)
                rotateClockwise()
                forward()
                grab()
                forward()
                extend()
                retract()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
