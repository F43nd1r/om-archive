
solution {
    puzzle = "P014"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -4
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -1 to 0
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
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
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
