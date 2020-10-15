
solution {
    puzzle = "P043"
    name = "B GX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -3
        rotation = 8
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to 0
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 6 to -3
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 5 to -4
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(95)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(30)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(39)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                back()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
