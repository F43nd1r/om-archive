
solution {
    puzzle = "P014"
    name = "B CX 1"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
