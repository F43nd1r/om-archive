
solution {
    puzzle = "P032"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 4 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -2
        rotation = 4
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
