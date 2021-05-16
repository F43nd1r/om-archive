
solution {
    puzzle = "P030b"
    name = "B X S F"
    arm(ARM6) {
        number = 1
        position = -5 to 4
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to -1
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -7
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -6
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -6 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to -1
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 4
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
