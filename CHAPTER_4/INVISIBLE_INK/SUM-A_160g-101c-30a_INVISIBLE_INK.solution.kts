
solution {
    puzzle = "P032"
    name = "B S"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = -9
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = -8
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to -1
        rotation = -9
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -2
        rotation = -11
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -8
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -8
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = -10
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -3
        rotation = -4
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
            sequence(3) {
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
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
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
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
