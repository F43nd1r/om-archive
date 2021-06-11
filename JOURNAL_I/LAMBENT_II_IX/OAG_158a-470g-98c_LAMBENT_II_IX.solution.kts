
solution {
    puzzle = "P058"
    name = "B CI93"
    arm(ARM1) {
        number = 1
        position = 1 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -6
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -5 to -1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 4 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 8 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 6 to -2
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = 6 to 0
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = 7 to -4
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -3
        rotation = 0
    }
    track {
        position = 1 to -6
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 7 to -5
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 5 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to -6
        positions = listOf(2 to -1, 1 to 0, 1 to 1)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -2 to -5
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -5 to -4
        positions = listOf(0 to 1, 0 to 0, 1 to 0, 1 to 1)
    }
    track {
        position = 3 to -8
        positions = listOf(-3 to 2, -4 to 3, -3 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                wait(9)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                wait(2)
                pivotCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(10)
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                back()
                reset()
                wait(5)
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        )
    }
}
