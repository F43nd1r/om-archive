
solution {
    puzzle = "P096"
    name = "B TI18C 1-12T"
    arm(ARM6) {
        number = 1
        position = -4 to 2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 5 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = 8
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 4 to -1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to -3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -4 to 5
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = 8 to -1
        rotation = -4
    }
    io(OUTPUT) {
        index = 2
        position = 2 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 3
        position = 8 to -4
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
