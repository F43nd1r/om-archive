
solution {
    puzzle = "P016"
    name = "W3"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 2 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
