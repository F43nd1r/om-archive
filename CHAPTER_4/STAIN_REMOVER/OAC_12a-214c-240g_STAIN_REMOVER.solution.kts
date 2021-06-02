
solution {
    puzzle = "P034"
    name = "NEW SOLUTION 4 (Copy)"
    arm(PISTON) {
        number = 1
        position = -2 to -7
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to -5
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -5
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to -7
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -7
        rotation = 3
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -5 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -6 to -5
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to -6
        rotation = 0
    }
    track {
        position = -3 to -6
        positions = listOf(1 to 0, 0 to 1, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                extend()
                grab()
                back()
                extend()
                wait(3)
                drop()
                retract()
                grab()
                forward()
                drop()
                retract()
                back()
                grab()
                wait(1)
                extend()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                drop()
                back()
                extend()
                grab()
                retract()
                drop()
                retract()
                forward()
            }
        }
        )
    }
}
