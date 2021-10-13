
solution {
    puzzle = "P087"
    name = "SUM4 519 COST"
    arm(ARM6) {
        number = 1
        position = -6 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to 4
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to 5
        rotation = 8
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to 5
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -5 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 1
        rotation = 0
    }
    track {
        position = -1 to 7
        positions = listOf(0 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(14)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
