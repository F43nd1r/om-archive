
solution {
    puzzle = "P007"
    name = "NEW SOLUTION 6"
    arm(PISTON) {
        number = 1
        position = -2 to -2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
