
solution {
    puzzle = "P087"
    name = "B CI118"
    arm(ARM1) {
        number = 1
        position = -1 to 5
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -5 to 6
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -4 to 6
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -2 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = -3 to 4
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = 2 to -3
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 11
        position = -4 to -4
        rotation = 7
        size = 1
    }
    arm(ARM3) {
        number = 12
        position = -1 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 0 to -4
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = -6 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 0 to -3
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -4 to 3
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -8 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 3
        rotation = 0
    }
    track {
        position = -5 to 6
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = -2 to 5
        positions = listOf(0 to -1, 0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -2 to -1, -1 to -2, -1 to -3, -1 to -4, -2 to -3, -2 to -2, -3 to -2, -3 to -3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                grab()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                forward()
                drop()
                wait(3)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                forward()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(4)
                back()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                forward()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
            }
        }
        )
    }
}
