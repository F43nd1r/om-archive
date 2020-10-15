
solution {
    puzzle = "P090"
    name = "B GCX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 1
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 9 to 1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 10 to 0
        rotation = 7
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 2
        rotation = 6
    }
    glyph(UNIFICATION) {
        position = -2 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -1
        rotation = 5
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    conduit {
        id = 100
        position = -3 to 1
        rotation = 0
    }
    conduit {
        id = 100
        position = 9 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                pivotClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(74)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(70)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(43)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(26)
                repeat()
                wait(15)
                repeat()
                wait(26)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
