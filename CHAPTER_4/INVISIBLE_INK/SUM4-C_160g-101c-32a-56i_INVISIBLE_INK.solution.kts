
solution {
    puzzle = "P032"
    name = "SUM4"
    arm(ARM6) {
        number = 1
        position = 3 to -2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 4 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -3
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(2)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(2)
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
