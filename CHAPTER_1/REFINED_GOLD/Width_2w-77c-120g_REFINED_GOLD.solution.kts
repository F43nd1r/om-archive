
solution {
    puzzle = "P010"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to -1
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -3
        rotation = 0
        size = 1
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                wait(7)
                retract()
                reset()
            }
        }
        )
    }
}
