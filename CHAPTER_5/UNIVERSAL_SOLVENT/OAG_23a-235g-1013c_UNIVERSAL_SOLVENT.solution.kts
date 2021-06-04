
solution {
    puzzle = "P043"
    name = "OVERLAP AG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = 2 to 0
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 3 to -3
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1, 1 to 1, 1 to 2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(30)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(9)
                rotateClockwise()
                wait(5)
                rotateCounterClockwise()
                wait(88)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(8)
                reset()
            }
        }
        )
    }
}
