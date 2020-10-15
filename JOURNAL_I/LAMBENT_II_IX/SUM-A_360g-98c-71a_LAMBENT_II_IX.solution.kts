
solution {
    puzzle = "P058"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -7 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -6 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -8 to -1
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 3 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 2 to -1
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 4
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -4
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 1
        rotation = 0
    }
    track {
        position = -7 to -2
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 3 to -3, 3 to -4)
    }
    track {
        position = -2 to 4
        positions = listOf(0 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
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
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
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
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                forward()
                forward()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateCounterClockwise()
                drop()
                back()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                back()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
