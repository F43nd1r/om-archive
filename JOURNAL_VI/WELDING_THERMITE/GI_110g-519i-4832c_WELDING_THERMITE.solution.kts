
solution {
    puzzle = "P094"
    name = "B GI NOGIF 1-2T"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 5 to 3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 4
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -5 to 4
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 5 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 4
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    track {
        position = 4 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 7 to 1
        rotation = 4
    }
    conduit {
        id = 100
        position = -4 to 2
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(22)
                grab()
                drop()
                wait(7)
                grab()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(3)
                grab()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                drop()
                wait(54)
                grab()
                drop()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                wait(8)
                grab()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(23)
                grab()
                drop()
                wait(14)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                wait(54)
                grab()
                drop()
                wait(1)
                grab()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(17)
                grab()
                drop()
                wait(4)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                forward()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                drop()
                wait(1)
                grab()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                drop()
                wait(1)
                grab()
                drop()
                wait(26)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                drop()
                wait(2)
                grab()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                wait(24)
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(5)
                grab()
                drop()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(5)
                grab()
                drop()
            }
        }
        )
    }
}
