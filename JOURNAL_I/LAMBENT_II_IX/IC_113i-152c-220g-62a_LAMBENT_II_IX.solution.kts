
solution {
    puzzle = "P058"
    name = "B S F"
    arm(ARM6) {
        number = 1
        position = -2 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -5 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to -4
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 3
        rotation = 0
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(4)
                repeat()
            }
        }
        )
    }
}
