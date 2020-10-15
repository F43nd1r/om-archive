
solution {
    puzzle = "P016"
    name = "B CA 1"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to -2
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
