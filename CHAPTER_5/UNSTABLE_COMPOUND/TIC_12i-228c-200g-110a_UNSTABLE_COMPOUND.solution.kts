
solution {
    puzzle = "P040"
    name = "B TI12"
    arm(ARM6) {
        number = 1
        position = -2 to -6
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -3
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -1 to -1
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 5 to -4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -5
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -7
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
