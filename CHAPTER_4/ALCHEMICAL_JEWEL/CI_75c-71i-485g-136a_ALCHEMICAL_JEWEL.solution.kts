
solution {
    puzzle = "P035"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = 1 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = 5 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -3
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -5
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -5
        rotation = 0
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
        position = 0 to 4
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -4 to 3
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -2 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 2 to 4
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -5 to 1
        positions = listOf(1 to -1, 2 to -2, 2 to -1)
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                wait(1)
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                forward()
                wait(1)
                forward()
                wait(1)
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                back()
                back()
                drop()
                back()
            }
        }
        )
    }
}
