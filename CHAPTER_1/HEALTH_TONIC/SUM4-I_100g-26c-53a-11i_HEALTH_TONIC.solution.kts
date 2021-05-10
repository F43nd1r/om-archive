
solution {
    puzzle = "P014"
    name = "NEW SOLUTION 4"
    arm(ARM1) {
        number = 1
        position = -1 to -5
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -1 to -1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -4 to -3
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
