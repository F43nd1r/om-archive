
solution {
    puzzle = "P064"
    name = "OVERLAP X"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 4 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to -4
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 3 to -3
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -3
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(1 to -2, 0 to -1, 0 to 0, 1 to 0, 1 to 1)
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                wait(2)
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(7)
                forward()
                back()
                wait(10)
                forward()
                wait(2)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                back()
                wait(2)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                wait(7)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                reset()
                back()
                grab()
                forward()
                pivotClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
            }
        }
        )
    }
}
