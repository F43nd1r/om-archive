
solution {
    puzzle = "P035"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 4
        rotation = -1
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -5 to 1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 5 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM3) {
        number = 8
        position = 5 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -5
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to 1
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(-1 to 1, 0 to 0, 0 to -1, -1 to 0, -2 to 1)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 1, 1 to 1, 1 to 0)
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 4 to 4
        positions = listOf(-1 to 0, -2 to 0, -1 to -1)
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                forward()
                wait(2)
                forward()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                back()
                wait(2)
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(5) {
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
            sequence(6) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                forward()
                drop()
            }
        }
        )
    }
}
