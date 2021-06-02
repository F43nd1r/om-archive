
solution {
    puzzle = "w1698787731"
    name = "B F 2 BIFFIEMAC42"
    arm(ARM6) {
        number = 1
        position = -2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 3
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -3 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 2 to -4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 2 to 1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -2 to 3
        rotation = 2
    }
    glyph(DISPERSION) {
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = 3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 0 to 3
        rotation = 4
    }
    io(INPUT) {
        index = 3
        position = -4 to 4
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
