
solution {
    puzzle = "P090"
    name = "B GI 1-3T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 10 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 10 to -1
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to 1
        rotation = 6
    }
    glyph(UNIFICATION) {
        position = -2 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 9 to -1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = -1
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
        position = 10 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(44)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(42)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                grab()
                reset()
                wait(55)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
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
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                pivotClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
