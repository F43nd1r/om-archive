
solution {
    puzzle = "P043"
    name = "OVERLAP ACX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 2
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
        position = 2 to -1
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
        position = 3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to 0
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 3 to 0
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 3 to -3
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
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
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(38)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(52)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                reset()
            }
        }
        )
    }
}
